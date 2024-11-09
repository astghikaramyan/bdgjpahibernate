import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by User on 13.09.2020.
 */
public class C {
    public static void main(String[] args) {
        try(FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get("f1.txt"), StandardOpenOption.WRITE)){
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            for(int i = 0; i < 26; i++){
                byteBuffer.put((byte)('A' + i));
            }
//            byteBuffer.rewind();
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
//            byteBuffer.flip();
//            for(int i = 0; i < byteBuffer.capacity()-1; i++){
//                System.out.println((char) byteBuffer.get());
//            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try(FileChannel fileChannel =
                    (FileChannel) Files.newByteChannel(Paths.get("ff.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ)){
            MappedByteBuffer mappedByteBuffer =
                    fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for(int i = 0; i < 26; i++){
                mappedByteBuffer.put((byte)('A' + i));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
