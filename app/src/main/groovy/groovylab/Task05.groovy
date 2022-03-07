/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab
//import groovy.grails.validation.routines.InetAddressValidator.routines.InetAddressValidator

class Task05 {
    public static boolean isIp(String ip) {
        return ip ==~ /^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/
}
    // return InetAddressValidator.getInstance().isValidInet4Address(ip);
//     static void main(String[] args) {
//         println Task05.isIp("10.0.152.164")
// } 
}
