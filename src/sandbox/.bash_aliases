alias ls='ls --color'
alias ll='ls -ahl --group-directories-first' 

# manage screenshots
alias ss_lst='ll ~/Pictures'
alias ss_clr='rm ~/Pictures/*'

# ssh
alias mkdevs.fr='ssh mkdevs.fr -t -- /bin/sh -c "tmux has-session && exec tmux attach || exec tmux"'

