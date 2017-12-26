package com.siva.IoExamples;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class PathResolve {
	Logger logger = Logger.getLogger(DirectoryExample.class);

	public void resolvePath() {
		Path dir = Paths.get("<Path>");
		Path file = Paths.get("<Path>");

		Path out = dir.resolve(file);
		logger.info(out);
	}

	public static void main(String[] args) {
		PathResolve p = new PathResolve();
		p.resolvePath();

	}

}
