package net.emforge.activiti.service.base;

import net.emforge.activiti.service.ActivitiLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ActivitiLocalServiceClpInvoker {
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName20;
    private String[] _methodParameterTypes20;
    private String _methodName21;
    private String[] _methodParameterTypes21;
    private String _methodName22;
    private String[] _methodParameterTypes22;
    private String _methodName23;
    private String[] _methodParameterTypes23;
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName28;
    private String[] _methodParameterTypes28;
    private String _methodName29;
    private String[] _methodParameterTypes29;
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;

    public ActivitiLocalServiceClpInvoker() {
        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName20 = "createNewModel";

        _methodParameterTypes20 = new String[] {
                "java.lang.String", "java.lang.String"
            };

        _methodName21 = "test";

        _methodParameterTypes21 = new String[] { "java.lang.String" };

        _methodName22 = "findAllExecutions";

        _methodParameterTypes22 = new String[] { "java.util.List" };

        _methodName23 = "findUniqueUserTaskNames";

        _methodParameterTypes23 = new String[] { "java.util.List" };

        _methodName24 = "findUniqueUserTaskAssignees";

        _methodParameterTypes24 = new String[] { "java.util.List" };

        _methodName25 = "findTopLevelProcessInstances";

        _methodParameterTypes25 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String"
            };

        _methodName28 = "suspendWorkflowInstance";

        _methodParameterTypes28 = new String[] { "long", "long" };

        _methodName29 = "resumeWorkflowInstance";

        _methodParameterTypes29 = new String[] { "long", "long" };

        _methodName30 = "stopWorkflowInstance";

        _methodParameterTypes30 = new String[] {
                "long", "long", "long", "java.lang.String"
            };

        _methodName31 = "addWorkflowInstanceComment";

        _methodParameterTypes31 = new String[] {
                "long", "long", "long", "long", "int", "java.lang.String"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return ActivitiLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            ActivitiLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            return ActivitiLocalServiceUtil.createNewModel((java.lang.String) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName21.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
            return ActivitiLocalServiceUtil.test((java.lang.String) arguments[0]);
        }

        if (_methodName22.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
            return ActivitiLocalServiceUtil.findAllExecutions((java.util.List) arguments[0]);
        }

        if (_methodName23.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
            return ActivitiLocalServiceUtil.findUniqueUserTaskNames((java.util.List<java.lang.String>) arguments[0]);
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return ActivitiLocalServiceUtil.findUniqueUserTaskAssignees((java.util.List<java.lang.String>) arguments[0]);
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return ActivitiLocalServiceUtil.findTopLevelProcessInstances((java.lang.String) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return ActivitiLocalServiceUtil.suspendWorkflowInstance(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            return ActivitiLocalServiceUtil.resumeWorkflowInstance(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return ActivitiLocalServiceUtil.stopWorkflowInstance(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (java.lang.String) arguments[3]);
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            ActivitiLocalServiceUtil.addWorkflowInstanceComment(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                ((Integer) arguments[4]).intValue(),
                (java.lang.String) arguments[5]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
