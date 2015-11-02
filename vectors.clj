(ns clojure-programs.vectors)

(= 1 (count [42]))
true

(= [1] (vec '(1)))
true

(= [nil nil] (vector nil nil))
true

(= [1 2] (vec '(1 2)))
true

(= [111 222 333] (conj [111 222] 333))
true

(=  :peanut (first [:peanut :butter :and :jelly]))
true

(= :jelly (last [:peanut :butter :and :jelly]) )
true

(= :and (nth [:peanut :butter :and :jelly] 2))
true

(= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))
true

(= (list 1 2 3 4) (vector 1 2 3 4))
true
