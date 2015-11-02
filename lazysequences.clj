(ns clojure-programs.lazysequences)

(= '(1 2 3 4) (range 1 5))
true

(= '(0 1 2 3 4) (range 5))
true

(= [0 1 2 3 4 5 6 7 8 9] (take 10 (range 100)))
true

(= [95 96 97 98 99] (drop 95(range 100)))
true

(= (range 20) (take 20 (iterate inc 0)))
true

(= [:a :a :a :a :a :a :a :a :a :a] (repeat 10 :a))

true
(= (repeat 100 :foo)(take 100 (iterate identity :foo)))
true
