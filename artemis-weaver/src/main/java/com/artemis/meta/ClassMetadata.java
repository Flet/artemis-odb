package com.artemis.meta;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

import org.objectweb.asm.Type;

@ToString
public final class ClassMetadata {
	public WeaverType annotation = WeaverType.NONE;
	
	public boolean isPreviouslyProcessed;
	
	// methods
	public boolean foundReset;
	public boolean foundEntityFor;

	public Type type;
	public String superClass;

	public List<MethodDescriptor> methods = new ArrayList<MethodDescriptor>(); 
	public List<FieldDescriptor> fields = new ArrayList<FieldDescriptor>();

	// pooled components
	public boolean forcePooledWeaving;
	
	// packed components
	public boolean foundStaticInitializer;
	public boolean directFieldAccess;


	public static enum WeaverType { NONE, POOLED, PACKED };
	
	public static class GlobalConfiguration {
		public static boolean ideFriendlyPacking;
		public static boolean enabledPooledWeaving;
	}
}
