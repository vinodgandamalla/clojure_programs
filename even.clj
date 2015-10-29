(defn is-even? [n]
  (if (= n 0)
   true
    (not (is-even? (dec n)))))
