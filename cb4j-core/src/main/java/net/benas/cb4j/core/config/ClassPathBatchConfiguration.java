/*
 * The MIT License
 *
 *  Copyright (c) 2012, benas (md.benhassine@gmail.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package net.benas.cb4j.core.config;

/**
 * Batch configuration class used to load configuration parameters from a properties file in classpath.<br/>
 *
 * @author benas (md.benhassine@gmail.com)
 */
public class ClassPathBatchConfiguration extends BatchConfiguration {

    /**
     * Initialize configuration from a properties file in classpath.
     * @param configurationFileName the configuration file name
     * @throws BatchConfigurationException thrown if :
     * <ul>
     *     <li>The configuration file is not found</li>
     *     <li>The configuration file cannot be read</li>
     * </ul>
     */
    public ClassPathBatchConfiguration(final String configurationFileName) throws BatchConfigurationException {
        super(configurationFileName);
        configurationProperties = BatchConfigurationUtil.loadParametersFromConfigurationFileInClasspath(configurationFileName, false);
    }

}
