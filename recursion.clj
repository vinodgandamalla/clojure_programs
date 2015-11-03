(ns clojure-programs.recursion)

(defn is-even? [n]
  (if (= n 0)
    true
    (not (is-even? (dec n)))))

(is-even? 5)
false

(is-even? 4)
true


(defn is-even-bigint? [n]
  (loop [n   n
         acc true]
    (if (= n 0)
      true
      (recur (dec n) (not acc)))))


(is-even-bigint? 100000405)
true


(defn recursive-reverse [coll]
  (loop [coll coll
         reversed ()]
    (if (= () coll)
      reversed
      (recur (rest coll) (cons (first coll) reversed)))))

(recursive-reverse  [1 2 3 4 5])
(5 4 3 2 1)


(defn factorial  [n]
  (loop [n n
         acc 1]
    (if (= 0 n)
      acc
      (recur (dec n) (* n acc)))))
