swt-starter
===========

[SWT (Standard Widget Toolkit)](http://www.eclipse.org/swt/) - Starter Application

Building
--------

####linux 32-bit
<pre><code>mvn assembly:assembly -Plinux</code></pre>

####linux 64-bit
<pre><code>mvn assembly:assembly -Plinux-64</code></pre>

####win32
<pre><code>mvn assembly:assembly -Pwin32</code></pre>

Running
-------
<pre><code>java -jar target/swt-starter.jar</code></pre>
