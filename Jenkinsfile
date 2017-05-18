pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh './mvnw clean compile'
			}
		}
		
		stage('Unit test') {
			steps {
				sh './mvnw test'
			}
		}
		
		stage('Check style') {
			steps {
				sh './mvnw checkstyle:check'
			}
		}
		
		stage('Build package') {
			steps {
				sh './mvnw clean package'
			}
		}
		
		stage('Docker image') {
			steps {
				sh 'docker build -t 127.0.0.1:5000/calculator .'
			}
		}
		
		stage('Docker push') {
			steps {
				sh 'docker push 127.0.0.1:5000/calculator'
			}
		}
	}
}
