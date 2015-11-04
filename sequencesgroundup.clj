(ns clojure-programs.sequencesgroundup)

(inc 2)
3

(inc [1 2 3])
ClassCastException clojure.lang.PersistentVector cannot be cast to java.lang.Number  clojure.lang.Numbers.inc (Numbers.java:112)


(def numbers[1 2 3])

(inc (nth numbers 0))
2

(inc (nth numbers 1))
3

[(inc (nth numbers 0)) (inc (nth numbers 1)) (inc (nth numbers 2))]

[2 3 4]

(cons 1 [ 2 3 4])

(1 2 3 4)

(defn inc-first [nums]
  (cons (inc (first nums))
        (rest nums)))

(inc-first [1 2 3 4])
(2 2 3 4)

(inc nil)
NullPointerException   clojure.lang.Numbers.ops (Numbers.java:1013)

(if true :a :b)
:a


(defn inc-first [nums]
  (if (first nums)
    (cons (inc (first nums))
          (rest nums))
    (list)))

(inc-first [])
()

(inc-first [1 2 3 4])
(2 2 3 4)


(inc-first [1 2 3 4])
(2 2 3 4)

(defn transform-all [f xs]
  (if (first xs)
    (cons (f (first xs))
          (transform-all f (rest xs)))
    (list)))

(transform-all inc  [1 2 3 4])
(2 3 4 5)

(transform-all list [:codex :book :manuscript])
((:codex) (:book) (:manuscript))

(take 10 (iterate inc 0))
(0 1 2 3 4 5 6 7 8 9)

(take 5 (iterate (fn [x] (str x "o")) "y"))
("y" "yo" "yoo" "yooo" "yoooo")


(take 10 (repeat :hi))
(:hi :hi :hi :hi :hi :hi :hi :hi :hi :hi)

(take 3 (repeatedly rand))
(0.5823119155511999 0.6916410342131043 0.20372574447433067)


(take 10 (cycle [1 2 3]))
(1 2 3 1 2 3 1 2 3 1)


(map (fn [n vehicle] (str "I've got " n " " vehicle "s"))
     [0 200 9]
     ["car" "train" "kiteboard"])
("I've got 0 cars" "I've got 200 trains" "I've got 9 kiteboards")

(map (fn [index element] (str index ". " element))
     (iterate inc 0)
     ["erlang" "ruby" "haskell"])

("0. erlang" "1. ruby" "2. haskell")


(map-indexed (fn [index element] (str index ". " element))
             ["erlang" "ruby" "haskell"])
("0. erlang" "1. ruby" "2. haskell")


(concat [1 2 3] [:a :b :c] [4 5 6])
(1 2 3 :a :b :c 4 5 6)

(interleave [:a :b :c] [1 2 3])
(:a 1 :b 2 :c 3)


(apply str(reverse "fool"))
"loof"


(seq "sato")
(\s \a \t \o)



(apply str (shuffle (seq "abracadabra")))
"acrdarababa"

(take 5 (range 10))
(0 1 2 3 4)


(drop 3 (range 10))
(3 4 5 6 7 8 9)

(take-last 3 (range 10))
(7 8 9)

(drop-last 3 (range 10))
(0 1 2 3 4 5 6)

(take-while pos? [3 2 1 0 -1 -2 10])
(3 2 1)

(split-at 4 (range 10))
[(0 1 2 3) (4 5 6 7 8 9)]


(split-with number? [1 2 3 :mark 4 5 6 :mark 7])
[(1 2 3) (:mark 4 5 6 :mark 7)]


(filter pos? [1 5 -4 -7 3 0])
(1 5 3)

(remove string? [1 "turing" :apple])
(1 :apple)

(partition 2 [:cats 5 :bats 27 :crocodiles 0])
((:cats 5) (:bats 27) (:crocodiles 0))

(partition-by neg? [1 2 3  -1 -2 -3 -2 -1 1 2])
((1 2 3) (-1 -2 -3 -2 -1) (1 2))


(frequencies [:meow :meow :meow :mrrw])
{:meow 3, :mrrw 1}


(reduce + [ 1 2 3 4])
10

(reduce conj #{} [:a :b :b :b :a :a])
#{:b :a}

(into {} [[:a 2] [:b 3]])
{:a 2, :b 3}

(into (list) [1 2 3 4])

(4 3 2 1)

(defn my-map [f coll]
  (reduce (fn [output element]
            (conj output (f element)))
          []
          coll))

(my-map inc [1 2 3 4])
[2 3 4 5]

(take 10 (filter odd? (iterate inc 0)))

(1 3 5 7 9 11 13 15 17 19)

(take 3 (partition 2 (filter odd? (iterate inc 0))) )
((1 3) (5 7) (9 11))


(take 3 (partition 2 1 (filter odd? (iterate inc 0))))
((1 3) (3 5) (5 7))

(take 3 (map (fn [pair] (* (first pair) (second pair)))
             (partition 2 1 (filter odd? (iterate inc 0)))))
(3 15 35)


(reduce +
        (take 1000
              (map (fn [pair] (* (first pair) (second pair)))
                   (partition 2 1
                              (filter odd?
                                      (iterate inc 0))))))
1335333000
