local_cljsrn:
	ansible-playbook -i hosts -l localhost tasks/main.yml --become-user $(BECOME_USER) --ask-sudo-pass --tags "misc,react-native,clojure,cljsrn,emacs"
