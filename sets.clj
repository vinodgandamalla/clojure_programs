(ns clojure-programs.sets)

(set '(1 2 3 4))
#{1 4 3 2}

(set [1 2 3])
#{1 3 2}

(= #{3} (set [3]) )
true

(= 4 (count #{1 2 3 4}))
true

(= #{1 2 3 4 5} (set '(1 1 2 2 3 3 4 4 5 5)))
true

(= #{1 2 3 4 5} (clojure.set/union #{1 2 3 4} #{2 3 5}))
true

(= #{2 3} (clojure.set/intersection #{1 2 3 4} #{2 3 5}))
true

(= #{1 4} (clojure.set/difference #{1 2 3 4 5} #{2 3 5}))
true
