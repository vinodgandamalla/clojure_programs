(=:a (if (false? (= 4 5))
          :a 
          :b))
true

(= [] (if (> 4 3)
	   []))
true

(= nil (if (nil? 0) [:a :b :c]))
 
true

(= :glory (if (not (empty? ()))
  			:doom
			:glory ))

true

(let [x 5] (= "your-road (cond (= x 1) :road-not-taken
			  	(= x 2) :another-road-not-taken
				:else :your-road)))

true

(= 'doom (if-not (zero? 0)
		'doom
		'doom))

true



