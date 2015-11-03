(ns clojure-programs.sequence-comprehension)


(= (range 6)
   (for [x (range 6)]
     x))
true

(= '(0 1 4 9 16 25)
   (map (fn [x] (* x x))
        (range 6))
   (for [x (range 6)]
     (* x x)))
true


(= '(1 3 5 7 9)
   (filter odd? (range 10))
   (for [x (range 10) :when (odd? x)]
     x))

true


(= '(1 9 25 49 81)
   (map (fn [x] (* x x))
        (filter odd? (range 10)))
   (for [x (range 10) :when (odd? x)]
     (* x x)))

true


(= [[:top :left] [:top :middle] [:top :right]
    [:middle :left] [:middle :middle] [:middle :right]
    [:bottom :left] [:bottom :middle] [:bottom :right]]
   (for [row [:top :middle :bottom]
         column [:left :middle :right]]
     [row column]))
true
