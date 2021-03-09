(defn hello-you [name]
(str "Hellow " name)
)

(defn hello-all
[& names]
(map hello-you names))

(defn sum
[x y]
(println (+ x y)))

(defn can-vote [age]
(if(>= age 18)
(println "You can vote")
(println "You cannot vote")))

(defn do-more-stuffs [age]
(if (>= age 18)
(do (println "You can drive")
(println "You can vote"))
(println "You cannot vote or drive")))

(defn when-ex [tof]
(when tof 
(println "1st thing")
(println "2nd thing")))

(defn what-grade 
[n]
(cond 
(<= n 5) (println "Estas en preescolar")
(and (> n 5) (<= n 11)) (println "Estas en primaria")
:else println "another grade"
)
)

(defn one-to-x [x]
(def i (atom 1))
(while (<= @i x)
(do 
(println @i)
(swap! i inc))))

(defn dbl-to-x [x]
(dotimes [i x] (println(* i 2))))


(defn triple-to-x [x y]
(loop [i x] (when (< i y) (println(* i 3)) (recur(+ 1 i)))))

(triple-to-x 1 10)

;(dbl-to-x 10)

;(one-to-x 100)

 
;(what-grade 50)

;(do-more-stuffs 25)

;(can-vote 25)
;(can-vote 12)

;(hello-you "Karel")
;(hello-all "Karel" "Jose" "Antonio")
;(sum 3 4)