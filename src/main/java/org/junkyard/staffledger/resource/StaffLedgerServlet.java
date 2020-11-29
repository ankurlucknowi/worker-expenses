package org.junkyard.staffledger.resource;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.servlet.SkillServlet;

import org.junkyard.staffledger.intentHandler.CancelandStopIntentHandler;
import org.junkyard.staffledger.intentHandler.AddStaffIntentHandler;
import org.junkyard.staffledger.intentHandler.HelpIntentHandler;
import org.junkyard.staffledger.intentHandler.SessionEndedRequestHandler;
import org.junkyard.staffledger.intentHandler.LaunchRequestHandler;

public class StaffLedgerServlet extends SkillServlet {

    public StaffLedgerServlet() {
        super(getSkill());
    }

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new AddStaffIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.5cf4c6ab-9367-462a-9aad-3b90db8f0e31")
                .build();
    }

}