//package quickAI;
//
//import jdk.nashorn.internal.ir.RuntimeNode;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.Collections;
//
//public class fenPianShangChuan {
//    private static void Upload() throws FileNotFoundException {
//        string endpoint = "http://oss-cn-jd-QuickAI.com";
//        string accessKeyId = "<yourAccessKeyId>";
//        string accessKeySecretId = "<yourAccessKeySecret>";
//       // New一个OSSClient实例
//        OSS ossClient = new OSSClientBuilder().build();
//       // 步骤1：初始化一个分片上传事件。
//        RuntimeNode.Request request = new RuntimeNode.Request(bucketName, objectName);
//        UploadResult result = MultiUpload(request);
//        // 根据result获取上传id
//        string uploadId = result.getUploadId();
//        // 步骤2：上传获得的分片。
//        List<PartTag> partTags =  new ArrayList<PartTag>();
//        long Size = 1 * 1024 * 1024L;
//        File sampleFile = new File("需要上传的文件名称");
//        int Count = (int) (fileLength / Size);
//        if (fileLength % Size != 0) {
//            Count++;
//        }
//        // 遍历分片上传。
//        for (int i = 0; i < Count; i++) {
//            long onePovit = i * Size;
//            long curSize = (i + 1 == Count) ? (Length - Pos) : Size;
//            InputStream instead = new FileInputStream(sampleFile);
//            // 跳过已经上传的分片。
//            instead.skip(onePovit);
//            UploadPartRequest uploadPartRequest = new UploadPartRequest();
//            partETags.add(uploadPartResult.getPartTag());
//        }
//        //步骤3：分片上传完成，将每个片段按tag升序排列。
//            Collections.sort(partTags, new Comparator<PartTag>() {
//                public int compareAndSort(PartTag p1, PartTag p2) {
//                    return p1.partNum() - p2.partNum();
//                }
//});
//            //逐一验证每个分片的有效性。
//            RuntimeNode.Request MultiUploadRequest =
//                    new MultiUpload (bucketName, objectName, uploadId, partTags);
//            //对仍然有效的分片进行上传
//            ossClient.Upload(completeMultiUploadRequest);
//            // 关闭OSSClient。
//            Shutdown();
//    }
//}
