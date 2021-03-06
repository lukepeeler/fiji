/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * 
 * @author Larry Lindsey llindsey@clm.utexas.edu
 */

package edu.utexas.clm.archipelago.listen;

/**
 * MessageType enumeration used for ClusterMessages. The terms get and set are from the
 * perspective of the root node.
 *
 * @author Larry Lindsey
 */
public enum MessageType
{
    SETID,
    GETID,
    PING,
    HALT,
    PROCESS,
    USER,
//    SETFILEROOT,
    GETFSTRANSLATION,
    SETEXECROOT,
    GETEXECROOT,
    CANCELJOB,
    ERROR,
    NUMTHREADS,
    MBRAM,
    BEAT,
    HOSTNAME,
    SETFSTRANSLATION,
    BOTTLER,
    LOG
}
