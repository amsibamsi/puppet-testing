(ns cljperf.core
  (:gen-class))

(def default-iterations
  "1000000")

(def default-repetitions
  "5")

(def default-size
  "1000000")

(defn loop-fn
  [iterations]
  (loop [i iterations]
    (if (> i 0)
      (recur (dec i))
      i)))

(defn loop-defn
  [i]
  (if (> i 0)
    (recur (dec i))
    i))

(defn loop-defn-typed
  ^long [^long i]
  (if (> i 0)
    (recur (dec i))
    i))

(defn loop-timesdo
  [i]
  (dotimes [n i]
    n))

(defn perf-loop
  [iterations repetitions]
  (do
    (println "loop fn ...")
    (dotimes [_ repetitions] (time (loop-fn iterations)))
    (println "loop defn ...")
    (dotimes [_ repetitions] (time (loop-defn iterations)))
    (println "loop defn typed ...")
    (dotimes [_ repetitions] (time (loop-defn-typed iterations)))
    (println "loop timesdo ...")
    (dotimes [_ repetitions] (time (loop-timesdo iterations)))))

(defn perf-array
  [size repetitions]
    (do
      (println "array set ...")
      (dotimes [_ repetitions]
        (time
          (let [a (int-array size 0)]
            (dotimes [i size] (aset a i i)))))))

(defn perf-sum
  [iterations repetitions]
  (do
    (println "sum ...")
    (dotimes [_ repetitions] (time (dotimes [i iterations] (+ i i))))))

(defn perf-mult
  [iterations repetitions]
  (do
    (println "multiplication ...")
    (dotimes [_ repetitions] (time (dotimes [i iterations] (* i i))))))

(defn perf
  [iterations size repetitions]
  (do
    (println "clojure performance ...")
    (perf-loop iterations repetitions)
    (perf-array size repetitions)
    (perf-sum iterations repetitions)
    (perf-mult iterations repetitions)))

(defn -main
  ([] (-main default-iterations))
  ([iterations] (-main iterations default-size default-repetitions))
  ([iterations size repetitions]
   (let [i (read-string iterations)
         s (read-string size)
         r (read-string repetitions)]
     (println i "iterations")
     (println "size" s)
     (println r "repetitions")
     (perf i s r)
     (cljperf.Perf/perf i s r))))
