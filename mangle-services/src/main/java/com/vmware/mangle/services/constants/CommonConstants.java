/*
 * Copyright (c) 2016-2019 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.mangle.services.constants;

/**
 * Add Constants Fields.
 *
 * @author kumargautam
 */
public class CommonConstants {

    private CommonConstants() {
    }

    public static final String NO_RECORD_FOUND_FOR_ID = "Fault not found for given id ";
    public static final String NO_RECORD_FOUND_FOR_NAME = "Fault not found for given name ";
    public static final String ENDPOINTS_RESULT_FOUND = "Successfully retrieved all the endpoints";
    public static final String ENDPOINTS_UPDATED = "Updated endpoint successfully";
    public static final String ENDPOINTS_CREATED = "Created endpoint successfully";
    public static final String CREDENTIALS_RESULT_FOUND = "Successfully retrieved all the credentials";
    public static final String CREDENTIALS_CREATED = "Created credential successfully";
    public static final String CREDENTIALS_DELETED = "Deleted credentials successfully";

    public static final String CERTIFICATES_RESULT_FOUND = "Successfully retrieved all the certificates";
    public static final String CERTIFICATES_CREATED = "Created certificates successfully";
    public static final String CERTIFICATES_DELETED = "Deleted certificates successfully";

    public static final String ENDPOINTS_DELETED = "Endpoints deleted successfully";
    public static final String TASKS_DELETED = "Tasks deleted successfully";
    public static final String TEST_CONNECTION_SUCCESS = "Test Connection is success";
    public static final String REQUEST_FAILED_MESSAGE_HEADER = "mangle_request_error";
    public static final String MESSAGE_HEADER = "mangle_message";
    public static final String PF4J_PLUGINS_DIR = "pf4j.pluginsDir";
    public static final String PF4J_MODE = "pf4j.mode";
    public static final String DEFAULT_PLUGIN_ID = "mangle-default-plugin";
    public static final String DEFAULT_BLOCK_SIZE = "8192000";
    public static final String ARGUEMENT_PREFIX = "__";
    public static final String PROCESS_IDENTIFIER_ARG = ARGUEMENT_PREFIX + "processIdentifier";
    public static final String KILL_PROCESS_REMEDIATION_COMMAND_ARG = ARGUEMENT_PREFIX + "remediationCommand";
    public static final String OS_TYPE_ARG = ARGUEMENT_PREFIX + "osType";
    public static final String LOAD_ARG = ARGUEMENT_PREFIX + "load";
    public static final String IO_SIZE_ARG = ARGUEMENT_PREFIX + "ioSize";
    public static final String TARGET_DIRECTORY_ARG = ARGUEMENT_PREFIX + "targetDir";
    public static final String TASK_FAILURE_REASON_FOR_CLEANUP = "Task update missed by Mangle";
    public static final String NO_INPROGRESS_TASK_FOR_CLEANUP = "No Inprogress tasks found in the given threshold time";
    public static final String INPROGRESS_TASK_FOR_CLEANUP = "Completed clean-up of inprogress tasks %s";
    public static final String SUPPORT_BUNDLE_PATH_NOT_NULL = "Support bundle path cannot be empty";
    public static final String MANGLE_SUPPORT_BUNDLE_FILE_NAME = "mangle-support-bundle-";
}
