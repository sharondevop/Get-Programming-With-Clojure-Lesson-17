(ns hello-name-twice)

;This is a program with a single string argument.
;A program that receives a name and prints it twice to the console with a comma between the two names.
(defn -main [my-name]
      (println (str my-name "," my-name)))