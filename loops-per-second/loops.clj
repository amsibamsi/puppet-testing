; install lein-exec
; lein exec loops.clj 1000000

(defn loops [n]
  (time (loop [i n] (if (> i 0) (recur (dec i))))))

(def iterations
  (read-string (second *command-line-args*)))

(dorun
  (println iterations "iterations")
  (loops iterations))
