#!/bin/sh

alias kubectl='kubectl -n sit-kos'

alias kp='kubectl get pod -o wide -n sit-kos'
alias ks='kubectl get service -o wide -n sit-kos'
alias kd='kubectl get deployment -o wide -n sit-kos'
alias kl='kubectl logs -f -n sit-kos'
