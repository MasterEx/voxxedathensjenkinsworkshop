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
				sh 'docker build -t calculator .
			}
		}
	}
}
