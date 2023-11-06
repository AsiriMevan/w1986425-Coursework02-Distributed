/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 8:10 AM
 * Package Name : ds.cw.synchronization
 * Project Name : synchronization-distiruted-lock
 */
package ds.cw.synchronization;

public interface DistributedTxListener {
    void onGlobalCommit();
    void onGlobalAbort();
}
