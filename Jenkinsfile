pipeline {
	agent any
		environment {
			DOCKERHUB_CREDENTIALS_ID = 'dockerhub-elena'
			DOCKERHUB_REPO = 'elenablinova/calculator'
			DOCKER_IMAGE_TAG = 'latest'
  		}
	stages {
		stage('Checkout') {
			steps {
				git 'https://github.com/elenabli/Calculator.git'
	    	}
	  	}
	  	stage('Build Docker Image') {
		    steps {
		      	script {
		      		docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
		      	}
		    }
	  	}
		stage('Push Docker Image') {
			steps {
				script {
				    docker.withRegistry('https://registry.hub.docker.com/v2/', DOCKERHUB_CREDENTIALS_ID) {
                        docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                    }
				}
			}
		}
	}
}