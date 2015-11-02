(ns clojure-programs.maps)

(= {:a 1 :b 2} (hash-map :a 1 :b 2))
true

(= {:a 1} (hash-map :a 1))
true

(= 3 (count #{1 2 3}))
true

(= 2 (get {:a 1 :b 2} :b))
true

(= 1 ({:a 1 :b 2} :a))
true

(= "Sochi" ({2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"} 2014))
true

(= nil (get {:a 1 :b 2} :c))
true

(= :key-not-found (get {:a 1 :b 2} :c :key-not-found))
true

(= true (contains? {:a nil :b nil} :b))
true

(= false (contains? {:a nil :b nil} :c))
true

(= {1 "January" 2 "February"} (assoc {1 "January"} 2 "February"))
true


(= {1 "January"} (dissoc {1 "January" 2 "February"} 2))
true


(= (list 2010 2014 2018)
   (sort (keys { 2014 "Sochi" 2018 "PyeongChang" 2010 "Vancouver"})))

true

(sort (vals {2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"}))
("PyeongChang" "Sochi" "Vancouver")
