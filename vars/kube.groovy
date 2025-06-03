def call(String kube) {
    withEnv(["KUBECONFIG=${kube}"]) {
        sh '''
            kubectl apply -f dep.yaml
            kubectl apply -f service.yaml
        '''
    }
}
