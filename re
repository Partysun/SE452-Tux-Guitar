# JAVA_HOME=/usr/lib/jvm/java-6-sun/
# JAVA=
# JAVAC=
# SWT_JAR=
which javac
/usr/bin/javac
which java
/usr/bin/java
cd TuxGuitar-lilypond && ant -v -d -Dpath.tuxguitar="/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar/tuxguitar.jar" -Dpath.itext="/usr/share/java/itext.jar" -Dpath.swt="" -Dlib.swt.jar="" -Ddist.version="java" -Ddist.file="NOT_EXISTENT_FILE" -Dant.build.javac.source=1.4 -Dant.build.javac.target=1.4 -Dbuild.jni.library.dir=. -Dbuild.jni.library.extension=.so -Dbuild.jni.library.prefix=lib -lib /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar  all
Apache Ant version 1.8.1 compiled on October 13 2010
Trying the default build file: build.xml
Buildfile: /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml
Adding reference: ant.PropertyHelper
Detected Java version: 1.6 in: /usr/lib/jvm/java-6-openjdk/jre
Detected OS: Linux
Adding reference: ant.ComponentHelper
Setting ro project property: ant.build.javac.source -> 1.4
Setting ro project property: build.jni.library.dir -> .
Setting ro project property: path.itext -> /usr/share/java/itext.jar
Setting ro project property: lib.swt.jar -> 
Setting ro project property: build.jni.library.prefix -> lib
Setting ro project property: path.swt -> 
Setting ro project property: ant.build.javac.target -> 1.4
Setting ro project property: dist.file -> NOT_EXISTENT_FILE
Setting ro project property: dist.version -> java
Setting ro project property: path.tuxguitar -> /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar/tuxguitar.jar
Setting ro project property: build.jni.library.extension -> .so
Setting ro project property: ant.file -> /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml
Setting ro project property: ant.file.type -> file
Adding reference: ant.projectHelper
Adding reference: ant.parsing.context
Adding reference: ant.targets
parsing buildfile /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml with URI = file:/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml
Setting ro project property: ant.project.name -> TuxGuitar-lilypond
Adding reference: TuxGuitar-lilypond
Setting ro project property: ant.project.default-target -> all
Setting ro project property: ant.file.TuxGuitar-lilypond -> /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml
Setting ro project property: ant.file.type.TuxGuitar-lilypond -> file
Project base dir set to: /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond
 +Target: 
 +Target: init
 +Target: build
 +Target: clean
 +Target: all
Adding reference: ant.LocalProperties
parsing buildfile jar:file:/usr/share/ant/lib/ant.jar!/org/apache/tools/ant/antlib.xml with URI = jar:file:/usr/share/ant/lib/ant.jar!/org/apache/tools/ant/antlib.xml from a zip file
 [property] Loading /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.properties
Override ignored for property "ant.build.javac.source"
Override ignored for property "path.tuxguitar"
Override ignored for property "path.swt"
Override ignored for property "ant.build.javac.target"
Setting project property: build.src.path -> src/
Setting project property: build.share.path -> share/
Setting project property: build.path -> build/
Setting project property: build.jar -> tuxguitar-lilypond.jar
Adding reference: class.path
Setting ro project property: ant.project.invoked-targets -> all
Attempting to create object of type org.apache.tools.ant.helper.DefaultExecutor
Adding reference: ant.executor
Build sequence for target(s) `all' is [clean, init, build, all]
Complete build sequence is [clean, init, build, all, ]

clean:
   [delete] Deleting directory /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build
   [delete] Deleting directory /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build
   [delete] Could not find file /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/tuxguitar-lilypond.jar to delete.

init:
    [mkdir] Created dir: /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build

build:
     [echo] +-------------------------------------------------+
     [echo] |          B U I L D I N G   P L U G I N          |
     [echo] +-------------------------------------------------+
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build.xml:28: warning: 'includeantruntime' was not set, defaulting to build.sysclasspath=last; set to false for repeatable builds
fileset: Setup scanner in dir /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src with patternSet{ includes: [**/*.java] excludes: [] }
    [javac] org/herac/tuxguitar/io/lilypond/LilypondOutputStream.java added as org/herac/tuxguitar/io/lilypond/LilypondOutputStream.class doesn't exist.
    [javac] org/herac/tuxguitar/io/lilypond/LilypondPluginExporter.java added as org/herac/tuxguitar/io/lilypond/LilypondPluginExporter.class doesn't exist.
    [javac] org/herac/tuxguitar/io/lilypond/LilypondSettings.java added as org/herac/tuxguitar/io/lilypond/LilypondSettings.class doesn't exist.
    [javac] org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java added as org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.class doesn't exist.
    [javac] org/herac/tuxguitar/io/lilypond/LilypondSongExporter.java added as org/herac/tuxguitar/io/lilypond/LilypondSongExporter.class doesn't exist.
    [javac] Compiling 5 source files to /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build
    [javac] Using modern compiler
    [javac] Compilation arguments:
    [javac] '-d'
    [javac] '/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build'
    [javac] '-classpath'
    [javac] '/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/build:/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar/tuxguitar.jar:/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond:/usr/share/ant/lib/ant-launcher.jar:/usr/share/java/xmlParserAPIs.jar:/usr/share/java/xercesImpl.jar:/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar:/usr/share/ant/lib/ant-apache-bcel.jar:/usr/share/ant/lib/ant-javamail.jar:/usr/share/ant/lib/ant-apache-xalan2.jar:/usr/share/ant/lib/junit.jar:/usr/share/ant/lib/ant-swing.jar:/usr/share/ant/lib/ant-jmf.jar:/usr/share/ant/lib/ant-apache-log4j.jar:/usr/share/ant/lib/ant-apache-oro.jar:/usr/share/ant/lib/ant-junit.jar:/usr/share/ant/lib/ant-jsch.jar:/usr/share/ant/lib/ant-commons-net.jar:/usr/share/ant/lib/ant-apache-regexp.jar:/usr/share/ant/lib/ant-jdepend.jar:/usr/share/ant/lib/ant-apache-resolver.jar:/usr/share/ant/lib/ant-commons-logging.jar:/usr/share/ant/lib/ant-antlr.jar:/usr/share/ant/lib/ant.jar:/usr/share/ant/lib/ant-nodeps.jar:/usr/share/ant/lib/ant-apache-bsf.jar:/usr/lib/jvm/java-6-openjdk/lib/tools.jar'
    [javac] '-sourcepath'
    [javac] '/home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src'
    [javac] '-target'
    [javac] '1.4'
    [javac] '-g:none'
    [javac] '-source'
    [javac] '1.4'
    [javac] 
    [javac] The ' characters around the executable and arguments are
    [javac] not part of the command.
    [javac] Files to be compiled:
    [javac]     /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondOutputStream.java
    [javac]     /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondPluginExporter.java
    [javac]     /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettings.java
    [javac]     /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java
    [javac]     /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSongExporter.java
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:3: package org.eclipse.swt does not exist
    [javac] import org.eclipse.swt.SWT;
    [javac]                       ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:4: package org.eclipse.swt.events does not exist
    [javac] import org.eclipse.swt.events.SelectionAdapter;
    [javac]                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:5: package org.eclipse.swt.events does not exist
    [javac] import org.eclipse.swt.events.SelectionEvent;
    [javac]                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:6: package org.eclipse.swt.layout does not exist
    [javac] import org.eclipse.swt.layout.GridData;
    [javac]                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:7: package org.eclipse.swt.layout does not exist
    [javac] import org.eclipse.swt.layout.GridLayout;
    [javac]                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:8: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Button;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:9: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Combo;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:10: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Composite;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:11: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Group;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:12: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Label;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:13: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Shell;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:14: package org.eclipse.swt.widgets does not exist
    [javac] import org.eclipse.swt.widgets.Spinner;
    [javac]                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:233: cannot find symbol
    [javac] symbol  : class GridLayout
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 	private GridLayout getColumnLayout(){
    [javac] 	        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:240: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 	private GridData getComboData(){
    [javac] 	        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:246: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 	private GridData getSpinnerData(){
    [javac] 	        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:252: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 	private GridData getButtonData(){
    [javac] 	        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:36: cannot find symbol
    [javac] symbol  : class Shell
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Shell dialog = DialogUtils.newDialog(TuxGuitar.instance().getShell(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:36: cannot access org.eclipse.swt.widgets.Shell
    [javac] class file for org.eclipse.swt.widgets.Shell not found
    [javac] 		final Shell dialog = DialogUtils.newDialog(TuxGuitar.instance().getShell(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
    [javac] 		                                                                        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:36: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Shell dialog = DialogUtils.newDialog(TuxGuitar.instance().getShell(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
    [javac] 		                                                                            ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:36: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Shell dialog = DialogUtils.newDialog(TuxGuitar.instance().getShell(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
    [javac] 		                                                                                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:37: cannot find symbol
    [javac] symbol  : class GridLayout
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		dialog.setLayout(new GridLayout(2, false));
    [javac] 		                     ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:40: cannot find symbol
    [javac] symbol  : class Composite
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnLeft = new Composite(dialog, SWT.NONE);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:40: cannot find symbol
    [javac] symbol  : class Composite
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnLeft = new Composite(dialog, SWT.NONE);
    [javac] 		                           ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:40: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnLeft = new Composite(dialog, SWT.NONE);
    [javac] 		                                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:41: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnLeft.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:41: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnLeft.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:41: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnLeft.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:44: cannot find symbol
    [javac] symbol  : class Composite
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnRight = new Composite(dialog, SWT.NONE);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:44: cannot find symbol
    [javac] symbol  : class Composite
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnRight = new Composite(dialog, SWT.NONE);
    [javac] 		                            ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:44: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Composite columnRight = new Composite(dialog, SWT.NONE);
    [javac] 		                                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:45: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnRight.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:45: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnRight.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                       ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:45: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		columnRight.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                                ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:49: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group trackGroup = new Group(columnLeft ,SWT.SHADOW_ETCHED_IN);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:49: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group trackGroup = new Group(columnLeft ,SWT.SHADOW_ETCHED_IN);
    [javac] 		                       ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:49: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group trackGroup = new Group(columnLeft ,SWT.SHADOW_ETCHED_IN);
    [javac] 		                                         ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:50: cannot find symbol
    [javac] symbol  : class GridLayout
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackGroup.setLayout(new GridLayout(2,false));
    [javac] 		                         ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:51: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:51: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:51: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:54: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Label trackLabel = new Label(trackGroup, SWT.NULL);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:54: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Label trackLabel = new Label(trackGroup, SWT.NULL);
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:54: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Label trackLabel = new Label(trackGroup, SWT.NULL);
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:56: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:56: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:56: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:58: cannot find symbol
    [javac] symbol  : class Combo
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Combo trackCombo = new Combo(trackGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:58: cannot find symbol
    [javac] symbol  : class Combo
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Combo trackCombo = new Combo(trackGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:58: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Combo trackCombo = new Combo(trackGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:58: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Combo trackCombo = new Combo(trackGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    [javac] 		                                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:63: cannot access org.eclipse.swt.widgets.Composite
    [javac] class file for org.eclipse.swt.widgets.Composite not found
    [javac] 		trackCombo.select(TuxGuitar.instance().getTablatureEditor().getTablature().getCaret().getTrack().getNumber() - 1);
    [javac] 		                                                                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:66: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button trackAllCheck = new Button(trackGroup,SWT.CHECK);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:66: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button trackAllCheck = new Button(trackGroup,SWT.CHECK);
    [javac] 		                                 ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:66: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button trackAllCheck = new Button(trackGroup,SWT.CHECK);
    [javac] 		                                                   ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:67: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackAllCheck.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,true,2,1));
    [javac] 		                                ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:67: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackAllCheck.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,true,2,1));
    [javac] 		                                         ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:67: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		trackAllCheck.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,true,2,1));
    [javac] 		                                                  ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:72: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group measureGroup = new Group(columnLeft,SWT.SHADOW_ETCHED_IN);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:72: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group measureGroup = new Group(columnLeft,SWT.SHADOW_ETCHED_IN);
    [javac] 		                         ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:72: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group measureGroup = new Group(columnLeft,SWT.SHADOW_ETCHED_IN);
    [javac] 		                                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:73: cannot find symbol
    [javac] symbol  : class GridLayout
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureGroup.setLayout(new GridLayout(2,false));
    [javac] 		                           ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:74: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:74: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:74: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                                 ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:80: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureFromLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:80: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureFromLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:80: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureFromLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		                                                 ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:82: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureFromLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                   ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:82: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureFromLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                            ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:82: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureFromLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                                     ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:84: cannot find symbol
    [javac] symbol  : class Spinner
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureFromSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:84: cannot find symbol
    [javac] symbol  : class Spinner
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureFromSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		                                       ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:84: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureFromSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		                                                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:90: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureToLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:90: cannot find symbol
    [javac] symbol  : class Label
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureToLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		                           ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:90: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Label measureToLabel = new Label(measureGroup, SWT.NULL);
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:92: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureToLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                 ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:92: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureToLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:92: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureToLabel.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,false,true));
    [javac] 		                                                   ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:94: cannot find symbol
    [javac] symbol  : class Spinner
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureToSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:94: cannot find symbol
    [javac] symbol  : class Spinner
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureToSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		                                     ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:94: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Spinner measureToSpinner = new Spinner(measureGroup, SWT.BORDER);
    [javac] 		                                                           ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:100: cannot find symbol
    [javac] symbol  : class SelectionAdapter
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureFromSpinner.addSelectionListener(new SelectionAdapter() {
    [javac] 		                                            ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:112: cannot find symbol
    [javac] symbol  : class SelectionAdapter
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		measureToSpinner.addSelectionListener(new SelectionAdapter() {
    [javac] 		                                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:125: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group layoutGroup = new Group(columnRight,SWT.SHADOW_ETCHED_IN);
    [javac] 		^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:125: cannot find symbol
    [javac] symbol  : class Group
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group layoutGroup = new Group(columnRight,SWT.SHADOW_ETCHED_IN);
    [javac] 		                        ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:125: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		Group layoutGroup = new Group(columnRight,SWT.SHADOW_ETCHED_IN);
    [javac] 		                                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:126: cannot find symbol
    [javac] symbol  : class GridLayout
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		layoutGroup.setLayout(new GridLayout());
    [javac] 		                          ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:127: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		layoutGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:127: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		layoutGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                       ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:127: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		layoutGroup.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                                ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:130: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button scoreCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:130: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button scoreCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		                              ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:130: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button scoreCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		                                                 ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:131: cannot find symbol
    [javac] symbol  : class GridData
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		scoreCheck.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                             ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:131: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		scoreCheck.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:131: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		scoreCheck.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
    [javac] 		                                               ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:135: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button tablatureCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		      ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:135: cannot find symbol
    [javac] symbol  : class Button
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button tablatureCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		                                  ^
    [javac] /home/caw/Courses/SE452/Project/SE452-Tux-Guitar/TuxGuitar-lilypond/src/org/herac/tuxguitar/io/lilypond/LilypondSettingsDialog.java:135: cannot find symbol
    [javac] symbol  : variable SWT
    [javac] location: class org.herac.tuxguitar.io.lilypond.LilypondSettingsDialog
    [javac] 		final Button tablatureCheck = new Button(layoutGroup,SWT.CHECK);
    [javac] 		                                                     ^
    [javac] 100 errors
