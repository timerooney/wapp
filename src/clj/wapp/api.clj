(ns wapp.api
  (:require [castra.core :refer [defrpc]]))

(defrpc get-state []
  (rand-int 1000))
