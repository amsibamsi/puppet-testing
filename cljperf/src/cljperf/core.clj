(ns cljperf.core
  (:gen-class))

(defn compute
  ^double [^double x]
  (if (< x 1000000000)
    (recur (inc x))
    x))

(defn perf
  []
  (println "clojure performance")
  (time (compute 0.0)))

(defn -main
  []
  (perf)
  (cljperf.Perf/perf))
