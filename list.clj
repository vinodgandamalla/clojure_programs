(ns clojure-programs.list)

(= '(1 2 3 4 5) (list 1 2 3 4 5))
true

(= 1 (first '(1 2 3 4 5)))
true


(= '(2 3 4 5) (rest '( 1 2 3 4 5)))
true

(= 3 (count '(dracula dooku chocula)))

true

(= 0 (count '()))
true

(= () (rest '(100)))
true

(= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))
true

(= '(:e :a :b :c :d) (conj '(:a :b :c :d) :e))
true

(= :a (peek '(:a :b :c :d :e)))
true

(= '(:b :c :d :e) (pop '(:a :b :c :d :e)))
true

(= "No dice!"  (try
                 (pop '())
                 (catch IllegalStateException e
                   "No dice!")))
true
