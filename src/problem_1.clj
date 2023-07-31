#!/usr/bin/env clj

(ns problem_1)

(defn sum_nat
  [n] 
  (if (<= n 1)
    0
    (if (== (rem n 5) 0)
      (+ n (sum_nat (- n 1)))
      (if (== (rem n 3) 0)
        (+ n (sum_nat (- n 1)))
        (sum_nat (- n 1))))))

(println (sum_nat 999))
