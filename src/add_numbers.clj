(ns add-numbers)

(defn display-addition [a b]
      ;A function that receives numbers and displays to the console the result of their addition
      (println (str "The addition of " a " and " b " is: " (+ a b) ".")))

(defn -main [a b]
      (display-addition (read-string a) (read-string b)))


