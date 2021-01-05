package at.jit.incidentlistener.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RaiseIncident implements JavaDelegate {
    @Override
    public void execute(final DelegateExecution delEx) throws Exception {
        throw new Exception("Some incident");
    }
}
