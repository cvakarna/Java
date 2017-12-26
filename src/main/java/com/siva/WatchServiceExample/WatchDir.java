package com.siva.WatchServiceExample;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import org.apache.log4j.Logger;

public class WatchDir {

	Logger logger = Logger.getLogger(WatchDir.class);

	public void watch() throws IOException { // get directory
		Path dir = Paths.get("<path>");
		// create empty watch service
		WatchService watcher = FileSystems.getDefault().newWatchService();
		dir.register(watcher);

		for (;;) {
			WatchKey key = null;
			try {
				key = watcher.take();

			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			for (WatchEvent<?> event : key.pollEvents()) {

				WatchEvent.Kind<?> kind = event.kind();
				logger.info(kind.name());
				logger.info(kind.type());
				logger.info(event.context());
				String name = event.context().toString();
				logger.info(name);
				if (name.equals("/home/bizruntime-10/siva@Bizruntime/docs")) {
					logger.info("dir deleted ");
					return;

				}
			}
			// keep looking for events
			key.reset();

		}

	}

	public static void main(String[] args) {
		WatchDir w = new WatchDir();
		try {
			w.watch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
