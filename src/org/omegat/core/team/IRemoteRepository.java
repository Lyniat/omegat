/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2012 Alex Buloichik
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 **************************************************************************/
package org.omegat.core.team;

import java.io.File;

/**
 * Interface for any remote repository implementation.
 * 
 * @author Alex Buloichik (alex73mail@gmail.com)
 */
public interface IRemoteRepository {
    /**
     * Allow or disable file locking.
     * 
     * File locking should be disabled for some repositories which check full snapshots instead one file, like
     * git,
     */
    boolean isFilesLockingAllowed();

    /**
     * Set credentials for repository access.
     */
    void setCredentials(String username, String password, boolean forceSavePlainPassword);

    /**
     * Set repository read-only mode, or read-write mode.
     */
    void setReadOnly(boolean value);

    /**
     * Check is file changed from BASE revision.
     */
    boolean isChanged(File file) throws Exception;

    /**
     * Update full project from remote repository.
     */
    void updateFullProject() throws NetworkException, Exception;

    /**
     * Initial project checkout.
     */
    void checkoutFullProject(String repositoryURL) throws Exception;

    /**
     * Get base revision ID of one file from working copy.
     */
    String getBaseRevisionId(File file) throws Exception;

    /**
     * Restore base revision of one file in working copy.
     */
    void restoreBase(File file) throws Exception;

    /**
     * Download HEAD revision of file from remote repository.
     */
    void download(File file) throws NetworkException, Exception;

    /**
     * Upload local changes into remote repository.
     * 
     * If upload fails because in the mean time the remote was updated by others, this function should not throw an error.
     *
     * Every new implementation must be checked for conflicts resolving on upload, because some other users
     * able to change remote repository in time between download and upload. There are two critical ways which
     * should be tested:
     * 
     * 1. Somebody changed the same segment in repository.
     * 
     * 2. Somebody changed other segments in repository.
     */
    void upload(File file, String commitMessage) throws NetworkException, Exception;

    /**
     * Credentials are not provided or not correct. Should trigger credentials-prompt
     */
    @SuppressWarnings("serial")
    public static class AuthenticationException extends Exception {
        public AuthenticationException(Exception ex) {
            super(ex);
        }
    }
    /**
     * Given repository does not exist on the remote machine
     *
     */
    @SuppressWarnings("serial")
	public static class BadRepositoryException extends Exception {
        public BadRepositoryException(String message) {
            super(message);
        }
    }

    /**
     * Network problems. E.g. no internet available.
     */
    @SuppressWarnings("serial")
    public static class NetworkException extends Exception {
        public NetworkException(Throwable ex) {
            super(ex);
        }
    }
}
