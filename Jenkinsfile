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
				sh 'docker build -t calculator .'
			}
		}
		
		stage('Docker push') {
			stage {
				sh 'docker push 10.0.2.15:5000/calculator'
			}
		}
	}
}
