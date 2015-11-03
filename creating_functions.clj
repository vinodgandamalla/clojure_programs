(ns clojure-programs.creating-functions)


(= [true false true] (let [not-a-symbol? (complement symbol?)]
                       (map not-a-symbol? [:a 'b "c"])))
true

(= [:wheat "wheat" 'wheat]
   (let [not-nil? (complement nil?)]
     (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))

true


(= 20 (let [multiply-by-5 (partial * 5)]
        (multiply-by-5 4)))
true

(= [:a :b :c :d]
   (let [ab-adder (partial concat [:a :b])]
     (ab-adder [:c :d])))
true

(defn square [x] (* x x))

(= 25 (let [inc-and-square (comp square inc)]
        (inc-and-square 4)))
true

(= 8 (let [double-dec (comp dec dec)]
       (double-dec 10)))

true

(= 99 (let [square-and-dec (comp dec square)]
        (square-and-dec 10)))

true
