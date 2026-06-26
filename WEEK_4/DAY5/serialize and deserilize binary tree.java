
public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildStringRepresentation(root, sb);
        return sb.toString();
    }

    private void buildStringRepresentation(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#,");
            return;
        }
        sb.append(node.val).append(",");
        buildStringRepresentation(node.left, sb);
        buildStringRepresentation(node.right, sb);
    }

    private int parsingIndex = 0;

    public TreeNode deserialize(String data) {
        String[] dataTokens = data.split(",");
        parsingIndex = 0; 
        return buildTreeFromTokens(dataTokens);
    }

    private TreeNode buildTreeFromTokens(String[] tokens) {
        if (parsingIndex >= tokens.length || tokens[parsingIndex].equals("#")) {
            parsingIndex++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(tokens[parsingIndex]));
        parsingIndex++;
        
        node.left = buildTreeFromTokens(tokens);
        node.right = buildTreeFromTokens(tokens);
        
        return node;
    }
}