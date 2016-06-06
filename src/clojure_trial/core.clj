(ns clojure-trial.core
  (:gen-class))

(defn square [x] (println "Square of " x "is:--"(* x x)))

(defn -main
  [& args]
  (def c 3)
  (println "========================Test Clojure Application=============")
  (let [a 4
        b 6
        ]
    (square a)
    (square b)
    )
  (println "One Incremented value of 3 is:--" (inc c))
  )

