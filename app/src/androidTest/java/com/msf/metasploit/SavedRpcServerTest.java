
package com.msf.metasploit;

import android.test.AndroidTestCase;

import java.io.IOException;

public class SavedRpcServerTest extends AndroidTestCase {

    public void testLoadAndSaveList() throws IOException {
        Msf msf = new Msf();
        msf.msfServerList.loadSavedServerList();
    }

}
