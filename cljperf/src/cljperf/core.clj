(ns cljperf.core
  (:gen-class))

(def default-iterations
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

(defn perf
  [iterations]
  (do
    (println "clojure")
    (println "loop fn...")
    (time (loop-fn iterations))
    (println "loop defn...")
    (time (loop-defn iterations))
    (println "loop defn typed...")
    (time (loop-defn-typed iterations))
    (println "loop timesdo...")
    (time (loop-timesdo iterations))))

(defn -main
  ([] (-main default-iterations))
  ([iterations]
   (let [i (read-string iterations)]
     (println i "iterations")
     (perf i)
     (cljperf.Perf/perf i))))
