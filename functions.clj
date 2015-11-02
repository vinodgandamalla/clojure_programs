(defn multiply-by-ten [n]
  (* 10 n))

(multiply-by-ten 7)
70

(defn square [n] (* n n))

(square 8)


(= 10 ((fn [n] (* 5 n)) 2))
true

(#(* 4 %) 15)
60

(#(+ 1 %1 %2 %3) 4 5 6)
16

(= 30 (#(* 15 %2) 1 2))
true


(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))
true

(= 9 ((fn [] ((fn [a b] (+ a b))4 5))))
true
