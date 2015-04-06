package ru.atc.pgu.proccenter.stub;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * User: vmaksimov
 */
public class AppliedDoc {

    public static List<EntityFileContent> unZip(byte[] bytes)  {
//        byte[] bytes = data.getContent().toString().getBytes("UTF-8");
        List<EntityFileContent> entityFileContents = new ArrayList<EntityFileContent>();
        try {
            ByteArrayInputStream binaryDataStream = new ByteArrayInputStream(bytes);
            byte[] buffer = new byte[2048];
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int size;
            while ((size = binaryDataStream.read(buffer, 0, buffer.length)) != -1) {
                bos.write(buffer, 0, size);
            }
            bos.flush();
            bos.close();
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bos.toByteArray()));
            ZipEntry entry;
            EntityFileContent entityFileContent;
            while ((entry = zipInputStream.getNextEntry()) != null) {

                bos = new ByteArrayOutputStream();
                while ((size = zipInputStream.read(buffer, 0, buffer.length)) != -1) {
                    bos.write(buffer, 0, size);
                }
                bos.flush();
                bos.close();
                ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                StringBuilder sb = new StringBuilder();
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(bis));
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
                entityFileContent = new EntityFileContent();
                entityFileContent.setName(entry.getName());
                entityFileContent.setContent(sb.toString());
                entityFileContents.add(entityFileContent);

            }
    }catch (Exception e){
        e.printStackTrace();
    }
        return entityFileContents;
    }
}
