(ns hello-name-twice-or-once)

;a program that receives a name and a number and:
;1. if the number is greater or equal than 2, it prints the name twice to the console with a comma between the two names.
;2. Otherwise it prints the name once

(defn display-name [my-name my-num]
      (if (>= my-num 2)
        (println (str my-name "," my-name))
        (println my-name)))


(defn -main [my-name my-num-str]
      (display-name my-name (read-string my-num-str)))

