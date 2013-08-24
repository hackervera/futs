(ns futs.core
	(:use futs.records)
	(:import [futs.records Cat Person Hunter File]))
(def cat (Cat. (atom "fluffy") (atom "tabby") (atom 0)))
(def person (Person. (atom "tyler") (atom 29)))
(def hunter (Hunter. cat))
(def file (File. "foobar.txt"))