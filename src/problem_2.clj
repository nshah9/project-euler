#!/usr/bin/env clj

(ns problem_2)

(defn sum_fib
  [n]
  ; (if (<= n 1)
    ; 0
    ; (if (== (rem n 5) 0)
      ; (+ n (sum_nat (- n 1)))
      ; (if (== (rem n 3) 0)
        ; (+ n (sum_nat (- n 1)))
        ; (sum_nat (- n 1))))))
  (if (== n 1)
    1
    ()))

(println (sum_fib 4000000))
