(ns cljperf.core
  (:gen-class))

(def default-iterations
  "1000000")

(def default-repetitions
  "5")

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

(defn perf
  [iterations repetitions]
  (do
    (println "clojure")
    (println "loop fn...")
    (dotimes [_ repetitions] (time (loop-fn iterations)))
    (println "loop defn...")
    (dotimes [_ repetitions] (time (loop-defn iterations)))
    (println "loop defn typed...")
    (dotimes [_ repetitions] (time (loop-defn-typed iterations)))
    (println "loop timesdo...")
    (dotimes [_ repetitions] (time (loop-timesdo iterations)))))

(defn -main
  ([] (-main default-iterations))
  ([iterations] (-main iterations default-repetitions))
  ([iterations repetitions]
   (let [i (read-string iterations)
         r (read-string repetitions)]
     (println i "iterations")
     (println r "repetitions")
     (perf i r)
     (cljperf.Perf/perf i r))))
