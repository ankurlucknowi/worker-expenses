package org.junkyard.staffledger.bootstrap;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlet.ServletHolder;
import org.junkyard.staffledger.resource.StaffLedgerServlet;

public class StaffLedgerApplication extends Application<StaffLedgerConfiguration> {
    public static void main(String[] args) throws Exception {
        new StaffLedgerApplication().run(args);
    }

    @Override
    public String getName() {
        return "Staff Ledger";
    }

    @Override
    public void initialize(Bootstrap<StaffLedgerConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(StaffLedgerConfiguration configuration,
                    Environment environment) {
        ServletHolder holder = new ServletHolder(new StaffLedgerServlet());
        environment.getApplicationContext().getServletHandler().addServletWithMapping(holder, "/staffLedger");
    }

}