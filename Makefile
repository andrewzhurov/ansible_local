local_cljsrn:
	ansible-playbook -i hosts -l localhost tasks/main.yml --become-user $(BECOME_USER) --ask-sudo-pass --tags "misc,react-native,clojure,cljsrn,emacs"

install_ansible:
	sudo apt-get install software-properties-common
	sudo apt-add-repository ppa:ansible/ansible
	sudo apt-get update
	sudo apt-get install ansible

